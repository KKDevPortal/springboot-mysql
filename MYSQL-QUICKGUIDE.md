# MySQL Quick Guide – `user` Table

This document provides **ready-to-use MySQL queries** for the `user` table mapped from your JPA entity.

---

## 📌 Table Information

**Database:** `springMysql`

**Table:** `user`

```sql
SHOW TABLES;
DESCRIBE user;
```

---

## 📊 Table Structure (JPA Mapping)

```java
@Table(name = "USER")
public class User {

    @Id
    @Column(name = "userId")
    private String userId;

    @Column(name = "userName")
    private String userName;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "emailId")
    private String emailId;

    @Column(name = "createdOn")
    private Date createdOn;
}
```

---

## 🔍 FIND (SELECT)

### Find All Users

```sql
SELECT * FROM user;
```

### Find by Primary Key `{key:value}`

```sql
SELECT * FROM user WHERE userId = 'U101';
```

### Find by User Name

```sql
SELECT * FROM user WHERE userName = 'Kaushal';
```

### Find by Mobile Number

```sql
SELECT * FROM user WHERE mobileNumber = '9876543210';
```

### Find by Email

```sql
SELECT * FROM user WHERE emailId = 'test@gmail.com';
```

### Partial Search (LIKE)

```sql
SELECT * FROM user WHERE userName LIKE 'K%';
```

### Find Users Created After a Date

```sql
SELECT * FROM user WHERE createdOn > '2024-01-01';
```

---

## ➕ INSERT

```sql
INSERT INTO user (userId, userName, mobileNumber, emailId, createdOn)
VALUES (
  'U101',
  'Kaushal',
  '9876543210',
  'kaushal@gmail.com',
  NOW()
);
```

---

## ✏️ UPDATE

### Update User Name by User ID

```sql
UPDATE user
SET userName = 'Kaushal Kishor'
WHERE userId = 'U101';
```

### Update Mobile & Email

```sql
UPDATE user
SET mobileNumber = '9999999999',
    emailId = 'newmail@gmail.com'
WHERE userId = 'U101';
```

⚠ Always use `WHERE` with UPDATE.

---

## ❌ DELETE

### Delete by User ID

```sql
DELETE FROM user WHERE userId = 'U101';
```

### Delete by Email

```sql
DELETE FROM user WHERE emailId = 'spam@gmail.com';
```

### Delete All Records

```sql
DELETE FROM user;
```

---

## 📈 COUNT & CHECK

### Count Total Users

```sql
SELECT COUNT(*) FROM user;
```

### Check If User Exists

```sql
SELECT 1 FROM user WHERE emailId = 'kaushal@gmail.com' LIMIT 1;
```

---

## 🚀 Performance Tips

```sql
CREATE INDEX idx_user_email ON user(emailId);
CREATE INDEX idx_user_mobile ON user(mobileNumber);
```

---

## 🧠 Notes

* Table name `user` is a **reserved keyword** in some DBs — use backticks if needed:

```sql
SELECT * FROM `user`;
```

* Match column names **exactly** as defined in `@Column`.

---

✅ Use this file as a **daily MySQL reference** for your Spring Boot project.
