from flask import Blueprint, url_for

blue = Blueprint('first_blue', __name__)

#從manage導入app進來

@blue.route('/')
def hello_world():
    return 'Hello World!'

@blue.route('/url_for_V')
def url():
    result = url_for('second_blue.hello_world') #藍圖名稱，函數名
    return result


