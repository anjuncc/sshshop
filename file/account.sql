
    create table `myshop`.`account`(
        `login` VARCHAR(20),
       `name` VARCHAR(20),
       `pass` VARCHAR(20),
       `id` INT UNSIGNED not null auto_increment,
        primary key (`id`)
    );

    create unique index `PRIMARY` on `myshop`.`account`(`id`);