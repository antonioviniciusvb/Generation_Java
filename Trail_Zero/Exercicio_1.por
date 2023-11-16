programa {
  funcao inicio() {
    
    inteiro entrada[] = {2,5,1,3,4,9,7,8,10,6}
    inteiro contador

    escreva ("**** Valores de Entrada ****\n")

    para (contador = 0; contador < 10; contador++) 
		{
			escreva (entrada[contador], " ")
		}

    //Ordenação
    inteiro tamanho = 10, i = 0, j = 0, temp = 0

    para (i = 0; i < tamanho; i++) 
		{
      para (j = i+1; j < tamanho; j++) 
      {
        se(entrada[i] < entrada[j]){

           		temp = entrada[i]
			     		entrada[i] = entrada[j]
			     		entrada[j] = temp
        }

      }
		}

    escreva ("**** Valores de Saida ****\n")

    para (contador = 0; contador < 10; contador++) 
		{
			escreva (entrada[contador], " ")
		}
  }
}
