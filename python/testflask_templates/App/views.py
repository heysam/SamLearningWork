from flask import Blueprint, render_template

blue = Blueprint('temp_blue', __name__)

@blue.route('/')
def hello_world():
    return 'Hello World!'

#以下方式可以讓3個都顯示一樣的頁面
@blue.route('/t1/')
@blue.route('/t3/')
def t1():
    return render_template('t1.html')

@blue.route('/t2/')
def t2():
    return render_template('t1.html')
###########################################
@blue.route('/B/')
def B():
    return render_template('B.html')


###############
#C繼承自B
###############
@blue.route('/C/')
def C():
    list = ['Ll1', 'Ll2', 'Ll3', 'Ll4', 'Ll5'] #給C.html做for
    msg = '<h2>views.py中的C() msg</h2>'
    return render_template('C.html', list=list, msg=msg)

