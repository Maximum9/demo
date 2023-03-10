CREATE TABLE USER (
	id INT PRIMARY KEY auto_increment,
	name VARCHAR (30),
	balance DOUBLE
);

CREATE TABLE wallet (
	uid INT,
	money DOUBLE,
  balance DOUBLE,
	FOREIGN KEY (uid) REFERENCES USER (id)
);

SELECT
	uid,
	id,
	NAME,
	wallet.balance,
	detail
FROM
	wallet,
	USER
WHERE
	id = uid
AND uid = 1

UPDATE USER
SET balance = balance - 100
WHERE
	id = 1;

INSERT INTO wallet
VALUES
	(
		1 ,- 100,
		(
			SELECT
				balance
			FROM
				USER
			WHERE
				id = 1
		)
	);