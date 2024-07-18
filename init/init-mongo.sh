#!/bin/bash
set -e

# Check if the collection is empty
if [ $(mongo --username root --password root --authenticationDatabase admin --quiet --eval "db.getSiblingDB('blackcoffer').news.count()") -eq 0 ]; then
    echo "Importing CSV data..."
    mongoimport --username root --password root --authenticationDatabase admin --db blackcoffer --collection news --type csv --file /docker-entrypoint-initdb.d/data.csv --headerline
else
    echo "Data already imported. Skipping CSV import."
fi
