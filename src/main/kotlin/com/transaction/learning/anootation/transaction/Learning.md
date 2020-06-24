# Challenges configuring spring data jpa 
- Required dependencies 
    - Spring data jpa starter ( includes Hibernate , jpa , javax , hikari pool, tomcat pool etc...)
    - postgres 
- Default schema for postgres is "public", in application.yml we can specify multiple schema against which flyway migration will run 
- FlyMigrationConfiguration - Spring autoconfigure provides ability to configure flyway migration against multiple schema
- Postgres follow default sql standards so all table names and column names are by defualt lower case unless wrapped inside double quote
- Use javax.persistence annotation over hibernate annotations - As hibernate is specific implementation of JPA , later we can easily switch from hibernate to other if we use javax.persistence.


# Zonky embedded database for integration testing 




 