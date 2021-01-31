docker run --rm -d --name resto_db -p 5432:5432 -e POSTGRES_DB=resto_db -e POSTGRES_PASSWORD=password postgres

mvn flyway:clean flyway:migrate