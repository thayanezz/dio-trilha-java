def d():
    animal = "elephant"
    def e():
        nonlocal animal
        animal = "Giraffe"
        print("Inside nested function: " + animal)
    
    print("Before calling function: " + animal)
    e()
    print("After calling the function: "+ animal)

animal = "camel"
d()
print("Global animal: "+ animal)