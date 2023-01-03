docker run --name mydb -d -p 3306:3306 --rm -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=crm -v "%cd%\datapersistence":/var/lib/mysql mysql
