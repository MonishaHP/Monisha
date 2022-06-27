class DemoClass:
    num = 101

    # non-parameterized constructor
    def __init__(self):
        self.num = 1122

    def read_number(self):
        print(self.num)
obj = DemoClass()
obj.read_number()