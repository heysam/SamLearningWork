import random
from flask import Blueprint,render_template
from App.models import Person,db

blue = Blueprint('blue1',__name__)
@blue.route('/')
def C():
   return 'HelloWorld!'

@blue.route('/createdb/')
def create_db():
   db.create_all()
   return 'DB Create Success'
   
@blue.route('/addperson/')
def add_person():
   p = Person()
   p.p_name = "Sam %d" % random.randrange(100)

   db.session.add(p)
   db.session.commit()
   return 'Person add Success'

@blue.route('/getperson/')
def get_person():
   persons = Person.query.all()

   for person in persons:      #使用for迴圈印出
      print(person.p_name)

   print (type(persons))   #<class 'list'>
   print(persons)          #[<Person 1>, <Person 2>, <Person 3>]
      
   #return 'GET Success'
   return render_template('PersonList.html', persons=persons)
