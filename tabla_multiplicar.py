def tabla_multiplicar():
    numero=input("Que tabla deseas: ")
    print("TABLA DEL "+str(numero))
    while(cont<11):
        print("numero "+ " x "+ str(cont)+ " = "+str(numero*cont))
        cont=cont+1
        
tabla_multiplicar()
