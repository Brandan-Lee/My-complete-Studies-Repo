def thing1(name):
    print("Welcome thing1", name)

    def thing2():
        print("Welcome thing2", name)

    thing2()

thing1("Brandan")