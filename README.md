# AVL-Tree
 

 
### Output example
 

 
Numero de elementos para inserir: 12
 
1a Chave: 50
 

 
Árvore montada: 
 

 
50(0)
 

 
2a Chave: 25
 

 
Árvore montada: 
 

 
50(1)
 
  |__25(0) (LEFT)
 

 
3a Chave: 75
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(0) (LEFT)
 
  |__75(0) (RIGHT)
 

 
4a Chave: 20
 

 
Árvore montada: 
 

 
50(1)
 
  |__25(1) (LEFT)
 
       |__20(0) (LEFT)
 
  |__75(0) (RIGHT)
 

 
5a Chave: 35
 

 
Árvore montada: 
 

 
50(1)
 
  |__25(0) (LEFT)
 
       |__20(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(0) (RIGHT)
 

 
6a Chave: 100
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(0) (LEFT)
 
       |__20(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(-1) (RIGHT)
 
       |__100(0) (RIGHT)
 

 
7a Chave: 65
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(0) (LEFT)
 
       |__20(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(0) (RIGHT)
 
       |__65(0) (LEFT)
 
       |__100(0) (RIGHT)
 

 
8a Chave: 10
 

 
Árvore montada: 
 

 
50(1)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(0) (RIGHT)
 
       |__65(0) (LEFT)
 
       |__100(0) (RIGHT)
 

 
9a Chave: 110
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(-1) (RIGHT)
 
       |__65(0) (LEFT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
10a Chave: 70
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(0) (RIGHT)
 
       |__65(-1) (LEFT)
 
            |__70(0) (RIGHT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
11a Chave: 55
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(0) (RIGHT)
 
       |__65(0) (LEFT)
 
            |__55(0) (LEFT)
 
            |__70(0) (RIGHT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
12a Chave: 53
 

 
Árvore montada: 
 

 
50(-1)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(1) (RIGHT)
 
       |__65(1) (LEFT)
 
            |__55(1) (LEFT)
 
                 |__53(0) (LEFT)
 
            |__70(0) (RIGHT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
*-------- Número de rotações -------------*
 
Remover a chave: 70
 
1
 
*-------- BUSCA DE CHAVE -------------*
 
Buscar a chave: 70
 
Value 70 found
 

 
Buscar a chave: 65
 
Value 65 found
 

 
Árvore montada: 
 

 
50(-1)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(1) (RIGHT)
 
       |__65(1) (LEFT)
 
            |__55(1) (LEFT)
 
                 |__53(0) (LEFT)
 
            |__70(0) (RIGHT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
*-------- REMOÇÃO DE CHAVE ----------*
 
Remover a chave: 70
 
Value null removed!
 

 
Right rotation
 
Value Node@74a14482 removed
 
Value Node@1540e19d removed!
 

 
Árvore montada: 
 

 
50(0)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(0) (RIGHT)
 
       |__55(0) (LEFT)
 
            |__53(0) (LEFT)
 
            |__65(0) (RIGHT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
*-------- BUSCA DE CHAVE -------------*
 
Buscar a chave: 70
 
Value 70 not found
 

 
*-------- INSERÇÃO DE CHAVE ----------*
 
Inserir chave: 70
 

 
Árvore montada: 
 

 
50(-1)
 
  |__25(1) (LEFT)
 
       |__20(1) (LEFT)
 
            |__10(0) (LEFT)
 
       |__35(0) (RIGHT)
 
  |__75(1) (RIGHT)
 
       |__55(-1) (LEFT)
 
            |__53(0) (LEFT)
 
            |__65(-1) (RIGHT)
 
                 |__70(0) (RIGHT)
 
       |__100(-1) (RIGHT)
 
            |__110(0) (RIGHT)
 

 
*-------- BUSCA MAIOR E MENOR --------*
 
Maximum value: 110
 
Min value: 10
 
