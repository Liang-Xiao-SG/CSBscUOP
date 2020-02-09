def print_spam():
    print('spam')

def do_twice(f,value):
    """
    """

    f(value)
    f(value)

def print_twice(bruce):
    print(bruce)
    print(bruce)

#do_twice(print_twice,'spam')

def do_four(f,value):
    do_twice(f,value)
do_four(print_twice,'spam')
