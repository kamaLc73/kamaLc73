import sqlite3

# Connect to the database
conn = sqlite3.connect('database.db')
cursor = conn.cursor()

# Update Alice's email
cursor.execute("UPDATE users SET email = ? WHERE name = ?", ("alice@gmail.com", "Alice"))

# Commit the transaction
conn.commit()

# Close the connection
conn.close()
