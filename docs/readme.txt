Создается бада занных MySQL:

create database red_shop;

Создается таблица товаров:

create table product
(
    id   int auto_increment primary key,
    name varchar(50) not null,
    price int not null
);

Некоторые тестовые данные:

insert into product (name, price)
values ('Play Station 5', 450),
       ('XBox Series S', 400),
       ('God of War - Ragnarok', 50),
       ('The Last of Us 2', 45);

В файле src/main/resources/application.properties добавляются
данные для подключения к базе данных:

spring.datasource.url=jdbc:mysql://100.10.10.8:3306/red_shop
spring.datasource.username=ruslan
spring.datasource.password=ruslan
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Если база данных развернута на том же ПК, где будет работать АПИ,
можно адрес 100.10.10.8 заменить на localhost.

В каталоге src/main/java/com/whit33th/azure/redshop/entity/
создается класс Product.java для описания талицы. Такой класс
необходим для каждой таблицы базы данных, для которой нужно
сгенерировать АПИ. Просто по шаблону создаем классы таблиц в
этом каталоге

В каталоге src/main/java/com/whit33th/azure/redshop/repository/
создается интерфейс ProductRepository.java. Самое важное здесь
расширение extends JpaRepository<Product, Integer>
Product - это класс нашей таблицы
Integer - тип автоинкрементного поля

Такие репозитарий-интерфейсы нужно сделать для каждой таблицы, для
которой нужен АПИ

АПИ работает на порте 17000. Настраивается в файле src/main/resources/application.properties
Если не настроить, АПИ по умолчанию стартует на порте 80,
который может быть занят XAMPP phpMyAdmin. Порт можно выбрать другой. Желательно
больше 10000 и меньше 65000, чтобы не нарваться на конфликт портов, если он занят

Если все сделано верно, приложение должно запуститься и сгенерировать
автоматическое АПИ для доступа к таблицам. Просмотреть сгенерированные АПИ
можно по ссылке:

Ссылка на справочник всех сгенерированных конечных точек АПИ:
http://localhost:17000/swagger-ui/index.html

Таким образом, при минимуме кодинга создается АПИ, в котором конечные точки
генерируются автоматически без участия программиста. Исповедуется принцип -
"Чем меньше написано кода, тем меньше шансов сделать ошибку".

Удачи!!!