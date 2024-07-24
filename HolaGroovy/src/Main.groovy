def boolean prueba(int a) {
  println("Hola " + a)
  return true
}

static void main(String[] args) {
  def a = 1
  def b = 2
  def c = "Hola"
  String d = "Prueba"
  def e = d + " " + c + a + b
  println e

  if (a == 1) {
    println "OK"
  } else {
    println("Falló");
  }

  for (int i = 0; i < 10; i++) {
    println ("El valor de i es " + i)
  }

  def numeros = [1, 2, 3, 4, 5]
  for (int n in numeros) {
    println("Numero: " + n)
  }

  def romanos = [1: "I", 2: "II", 3: "III", 4: "IV"]

  println(romanos)

}