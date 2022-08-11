
def fibonacci (n): #функция вычисляет значение n в последовательности

    if n in {0, 1}:
        return n
    else:
        return fibonacci(n-1) + fibonacci(n-2)



fib_length = int(input("введите длину последовательности"))
[fibonacci(n) for n in range(fib_length)] 
