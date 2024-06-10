from flask import Flask, render_template
import sqlite3

app = Flask(__name__)


@app.route('/')
def index():
    conn = sqlite3.connect('database.db')
    cursor = conn.cursor()

    # Fetch all users
    cursor.execute("SELECT * FROM users;")
    rows = cursor.fetchall()
    
    # Close the connection
    conn.close()

    return render_template("index.html", users=rows)

if __name__ == "__main__":
    app.run(debug=True, use_reloader=True, threaded=False)
    
