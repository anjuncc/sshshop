package a.j.shop.service.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import a.j.shop.service.BaseService;

@SuppressWarnings("unchecked")
@Service("baseServie")
@Lazy(true)
public class BaseServiceImpl<T> implements BaseService<T> {
	@Resource
	private SessionFactory sessionFactory;

//	public void setSessionFactory(SessionFactory sessionFactory) {
//		this.sessionFactory = sessionFactory;
//	}

	private Class<T> clazz;
	
	public BaseServiceImpl() {
		System.out.println("this代表当前调用构造方法的对象:" + this);
		System.out.println("this parent:" + this.getClass().getSuperclass());
		System.out.println("this parent:"
				+ this.getClass().getGenericSuperclass());
		ParameterizedType type = (ParameterizedType) this.getClass()
				.getGenericSuperclass();
		clazz = (Class<T>) type.getActualTypeArguments()[0];
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(T t) {
		getSession().save(t);
	}

	@Override
	public void update(T t) {
		getSession().update(t);
	}

	@Override
	public void delete(int id) {
		String hql = "select * from " + clazz.getSimpleName() + " where id=:id";
		getSession().createQuery(hql).setInteger("id", id).executeUpdate();

	}

	@Override
	public T get(int id) {
		return (T) getSession().get(clazz, id);
	}

	@Override
	public List<T> query() {
		String hql = "from " + clazz.getSimpleName();
		return getSession().createQuery(hql).list();
	}

}
