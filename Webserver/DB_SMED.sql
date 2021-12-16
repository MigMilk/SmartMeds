CREATE TABLE `Login`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `email` VARCHAR(255) NOT NULL,
    `password` VARCHAR(255) NOT NULL,
    PRIMARY KEY `login_id_primary`(`id`)
);
CREATE TABLE `Users`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `Nome` INT NOT NULL,
    PRIMARY KEY `users_id_primary`(`id`)
);

CREATE TABLE `Utente`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `Nome` VARCHAR(255) NOT NULL,
    `receita_id` INT NOT NULL,
    `stock_id` INT NOT NULL,
    `extra_info` VARCHAR(255) NOT NULL,
    `shared_stock` TINYINT(1) NOT NULL,
    PRIMARY KEY `utente_id_primary`(`id`)
);

CREATE TABLE `Receitas`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `nome_med` VARCHAR(255) NOT NULL,
    `quantity` INT NOT NULL,
    `intake_period` VARCHAR(255) NOT NULL,
    `daily_amnt` INT NOT NULL,
    `intro_date` DATE NOT NULL,
    `description` VARCHAR(255) NOT NULL,
    PRIMARY KEY `receitas_id_primary`(`id`);
);

CREATE TABLE `Stock`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `nome_med` VARCHAR(255) NOT NULL,
    `per_box_amnt` INT NOT NULL,
    `total_amnt` INT NOT NULL,
    PRIMARY KEY `stock_id_primary`(`id`)
);

CREATE TABLE `User_utente`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `user_id` INT NOT NULL,
    `utente_id` INT NOT NULL,
    PRIMARY KEY `user_utente_id_primary`(`id`)
);

CREATE TABLE `utente_receitas`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `utente_id` INT NOT NULL,
    `receita_id` INT NOT NULL,
    PRIMARY KEY `utente_receitas_id_primary`(`id`)
);

CREATE TABLE `Localizaçao`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `piso` INT NOT NULL,
    `quarto` INT NOT NULL,
    `corredor` INT NOT NULL,
    PRIMARY KEY `localizaçao_id_primary`(`id`)
);

CREATE TABLE `utente_localizaçao`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `utente_id` INT NOT NULL,
    `locale_id` INT NOT NULL,
    PRIMARY KEY `utente_localizaçao_id_primary`(`id`);
);

CREATE TABLE `utente_tasks`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `utente_id` INT NOT NULL,
    `task_id` INT NOT NULL,
    PRIMARY KEY `utente_tasks_id_primary`(`id`)
);

CREATE TABLE `tasks`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `task list` VARCHAR(255) NOT NULL,
    PRIMARY KEY `tasks_id_primary`(`id`)
);

CREATE TABLE `time_table`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `t_start` TIME NOT NULL,
    `t_end` TIME NOT NULL,
    `period_name` VARCHAR(255) NOT NULL,
    PRIMARY KEY `time_table_id_primary`(`id`)
);

CREATE TABLE `utente_stock`(
    `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
    `utente_id` INT NOT NULL,
    `stock_id` INT NOT NULL,
    PRIMARY KEY `utente_stock_id_primary`(`id`)
);

ALTER TABLE
    `User_utente` ADD CONSTRAINT `user_utente_user_id_foreign` FOREIGN KEY(`user_id`) REFERENCES `Users`(`id`);
ALTER TABLE
    `utente_receitas` ADD CONSTRAINT `utente_receitas_utente_id_foreign` FOREIGN KEY(`utente_id`) REFERENCES `Utente`(`id`);
ALTER TABLE
    `utente_stock` ADD CONSTRAINT `utente_stock_utente_id_foreign` FOREIGN KEY(`utente_id`) REFERENCES `Utente`(`id`);
ALTER TABLE
    `User_utente` ADD CONSTRAINT `user_utente_utente_id_foreign` FOREIGN KEY(`utente_id`) REFERENCES `Utente`(`id`);
ALTER TABLE
    `utente_stock` ADD CONSTRAINT `utente_stock_stock_id_foreign` FOREIGN KEY(`stock_id`) REFERENCES `Stock`(`id`);
ALTER TABLE
    `utente_receitas` ADD CONSTRAINT `utente_receitas_receita_id_foreign` FOREIGN KEY(`receita_id`) REFERENCES `Receitas`(`id`);
ALTER TABLE
    `utente_localizaçao` ADD CONSTRAINT `utente_localizaçao_locale_id_foreign` FOREIGN KEY(`locale_id`) REFERENCES `Localizaçao`(`id`);
ALTER TABLE
    `utente_localizaçao` ADD CONSTRAINT `utente_localizaçao_utente_id_foreign` FOREIGN KEY(`utente_id`) REFERENCES `Utente`(`id`);
ALTER TABLE
    `utente_tasks` ADD CONSTRAINT `utente_tasks_utente_id_foreign` FOREIGN KEY(`utente_id`) REFERENCES `Utente`(`id`);
ALTER TABLE
    `utente_tasks` ADD CONSTRAINT `utente_tasks_task_id_foreign` FOREIGN KEY(`task_id`) REFERENCES `tasks`(`id`);