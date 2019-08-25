mysql> desc movie;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| movie_id   | int(11)      | NO   | PRI | NULL    | auto_increment |
| movie_name | varchar(255) | YES  |     | NULL    |                |
| restricted | varchar(255) | YES  |     | NULL    |                |
| view_link  | varchar(255) | YES  |     | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
INSERT INTO MOVIE (movie_id, movie_name, restricted, view_link) VALUES (1010, 'Mission Mangal', 'UA', 'link');

mysql> desc theatre;
+--------------+--------------+------+-----+---------+----------------+
| Field        | Type         | Null | Key | Default | Extra          |
+--------------+--------------+------+-----+---------+----------------+
| theatre_id   | int(11)      | NO   | PRI | NULL    | auto_increment |
| price        | double       | NO   |     | NULL    |                |
| theatre_name | varchar(255) | YES  |     | NULL    |                |
+--------------+--------------+------+-----+---------+----------------+
INSERT INTO THEATRE (theatre_id, price, theatre_name) VALUES (101, 340, 'Forum PVR')

mysql> desc movie_theatre;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| id         | int(11)      | NO   | PRI | NULL    | auto_increment |
| show_date  | varchar(255) | YES  |     | NULL    |                |
| movie_id   | int(11)      | YES  | MUL | NULL    |                |
| theatre_id | int(11)      | YES  | MUL | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
INSERT INTO MOVIE_THEATRE (id, show_date, movie_id, theatre_id) VALUES (1001, '2019-08-23', (SELECT movie_id FROM MOVIE WHERE movie_name='Mission Mangal'), (SELECT theatre_id FROM THEATRE WHERE theatre_name='Forum PVR'));


mysql> desc seat;
+----------------+----------+------+-----+---------+----------------+
| Field          | Type     | Null | Key | Default | Extra          |
+----------------+----------+------+-----+---------+----------------+
| seat_id        | int(11)  | NO   | PRI | NULL    | auto_increment |
| available_seat | int(11)  | YES  |     | NULL    |                |
| show_time      | tinyblob | YES  |     | NULL    |                |
| total_seat     | int(11)  | YES  |     | NULL    |                |
| theatre_id     | int(11)  | YES  | MUL | NULL    |                |
+----------------+----------+------+-----+---------+----------------+
INSERT INTO SEAT (seat_id, available_seat, show_time, total_seat, theatre_id) VALUES (1010, 50, TIME('18:23:25'), 60, (SELECT theatre_id FROM THEATRE WHERE theatre_name='Forum PVR'));

mysql> desc my_movie;
+------------+--------------+------+-----+---------+----------------+
| Field      | Type         | Null | Key | Default | Extra          |
+------------+--------------+------+-----+---------+----------------+
| ticket_id  | int(11)      | NO   | PRI | NULL    | auto_increment |
| book_date  | varchar(255) | YES  |     | NULL    |                |
| email_id   | varchar(255) | YES  |     | NULL    |                |
| price      | double       | YES  |     | NULL    |                |
| total_seat | int(11)      | YES  |     | NULL    |                |
| movie_id   | int(11)      | YES  | MUL | NULL    |                |
| theatre_id | int(11)      | YES  | MUL | NULL    |                |
+------------+--------------+------+-----+---------+----------------+
