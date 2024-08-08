fun main() {  
    println("Bienvenido a la calculadora sencilla")  

    // Solicitar al usuario el primer número  
    print("Ingrese el primer número: ")  
    val numero1 = readLine()!!.toDouble()  

    // Solicitar al usuario el segundo número  
    print("Ingrese el segundo número: ")  
    val numero2 = readLine()!!.toDouble()  

    // Solicitar al usuario la operación que desea realizar  
    println("Seleccione la operación:")  
    println("1. Sumar")  
    println("2. Restar")  
    println("3. Multiplicar")  
    println("4. Dividir")  

    print("Ingrese el número de la operación: ")  
    val operacion = readLine()!!  

    val resultado = when (operacion) {  
        "1" -> numero1 + numero2  
        "2" -> numero1 - numero2  
        "3" -> numero1 * numero2  
        "4" -> {  
            if (numero2 != 0.0) {  
                numero1 / numero2  
            } else {  
                println("Error: No se puede dividir entre cero.")  
                return  
            }  
        }  
        else -> {  
            println("Operación no válida.")  
            return  
        }  
    }  

    // Mostrar el resultado  
    println("El resultado es: $resultado")  
}