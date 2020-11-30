# IFSUDESTEMG-PosWebMobile-DesenvolvimentoWebMobile-Atividade1

1: O crivo de Eratóstenes é um algoritmo usado para identificar números primos. O algoritmo (apresentado aqui da maneira mais simples) primeiro declara um array de N posições de valores booleanos, todos iguais a true (considerando que em princípio qualquer número pode ser primo). O algoritmo, em seguida, marca todos os elementos do array cujos índices são múltiplos de 2 e maiores que o próprio 2 como false, indicando que nenhum múltiplo de dois pode ser primo. O algoritmo repete esse último procedimento para todos os valores múltiplos de 3 e maiores que 3, depois para todos os valores múltiplos de 4 e maiores que 4, e assim sucessivamente, até chegar até N/2. Ao final, os índices dos elementos do array que valerem false serão valores não-primos, e os que ainda valerem true depois da execução do algoritmo serão primos. Dica: Para entender melhor o algoritmo, rode uma simulação em papel antes.  

2: Escreva uma implementação de uma tabela hash na qual tanto os valores quanto as chaves são do tipo string. Você não deve usar o HashMap, já existente no java, e sim implementar a sua própria versão de uma tabela hash. Defina os seguintes métodos: get(key), put(key,value), remove(key), containsKey(key), e size(). Lembre-se que todo objeto possui o método .hashCode() que pode ser usado para gerar um código hash para esse objeto. Escreva também um programa para testar sua solução.
