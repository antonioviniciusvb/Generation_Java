programa {
  funcao inicio() {
    
    inteiro entrada[] = {2,5,1,3,4,9,7,8,10,6}
    inteiro indice, tamanho = 10

    mensagem(entrada, tamanho, "Valores de Entrada")

    inteiro indicePares = 0, indiceImpares = 0
    inteiro pares[10], impares[10]

    para (indice = 0; indice < tamanho; indice++) 
		{
      //Verificando se o número é par ou impar
       se(entrada[indice] % 2 == 0){
          
          pares[indicePares++] = entrada[indice]          

       }senao{

          impares[indiceImpares++] = entrada[indice]
       }
    }

    mensagem(impares, indiceImpares, "Elementos nos índices ímpares: ")

    mensagem(pares, indicePares, "Elementos nos índices pares: ")

    inteiro total = soma(entrada, tamanho)

    escreva("Soma: ", total)

    real media = total / tamanho

    escreva("\nMédia: ", media)
  }

  funcao mensagem(inteiro valores[], inteiro tamanho, cadeia titulo){

    escreva (titulo, ": ")

    inteiro indice = 0

    para (indice = 0; indice < tamanho; indice++) 
		{
			escreva (valores[indice], " ")
		}

    escreva("\n")
  }

  funcao inteiro soma(inteiro valores[], inteiro tamanho){
      inteiro soma = 0, indice = 0

    para (indice = 0; indice < tamanho; indice++) 
		{
			soma += valores[indice]
		}

    retorne soma
  }
}
