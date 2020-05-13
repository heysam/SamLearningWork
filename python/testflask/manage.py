from flask import Flask

app = Flask(__name__) #__name__ 獲取自己的導入名字

@app.route('/')
def hello_world():
    return 'Hello Flask'
if __name__ == '__main__':
    app.run(debug=True, port=8000, host='0.0.0.0')


