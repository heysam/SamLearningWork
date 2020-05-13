from flask import Blueprint

blue = Blueprint('second_blue', __name__)

@blue.route('/views2/')
def hello_world():
    return 'views2'