# 🔗 Spring API
Test amaçlı uygulamalarınızda kullanabileceğiniz local backend uygulaması.
> Lokalde kullanabilmek için application.properties yapılandırma dosyası üzerinde değişiklikler yapmanız gerekmektedir.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/MYSQL_VERITABANI_ADINIZ?useSSL=false&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=MYSQL_SIFRENIZ
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

## ⚙️ API Reference

#### GET Method

```http
  GET /games
```
> Tüm oyunların bir listesini JSON formatında geri döner.

#### POST Method

```http
  POST /add
```
> Tüm oyun listesine oyun eklemenize olanak sağlar.
JSON formatında body bekler.

Örnek body: 
```json
  {
        "name": "Revelation Online",
        "description": "A free-to-play fantasy MMO developed by NetEase and published by My.com.",
        "imageUrl": "https://www.freetogame.com/g/77/thumbnail.jpg",
        "genre": "MMORPG"
  }
```

#### DELETE Method
> Tüm oyun listesinden id'si ile istenilen oyun silinir.
```http
  DELETE /delete/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required** — Oyunun id'si istenir. |


#### PUT Method
> Tüm oyun listesinden id'si ile istenilen oyun güncellenir.

```http
  PUT /update/{id}
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `int` | **Required** — Oyunun id'si istenir. |


