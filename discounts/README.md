# Скидки
В магазине акция: скидка 5% на товары, 
цена которых равна или превышает 1000 рублей. 
Напишите программу, имитирующую 
работу кассового аппарата: вводятся цены 
покупаемых товаров, нужно вывести сумму покупки
без скидки, сумму покупки с учётом скидки и 
размер скидки в одной строке, разделитель - пробел. 
Каждая цена товара вводится в 
новой строке. Отрицательное число - 
сигнал остановки ввода. 


## Формат входных данных
Несколько вещественных чисел в отдельной строке
## Формат выходных данных
Строка содержащая: сумму покупки 
без скидки, сумму покупки с учётом скидки, 
размер скидки, разделенных пробелом

## Примеры:
### Входные данные
```
25  
2000  
370.35  
-1
```
### Результат работы
```
2395.35 2295.35 100.0
```
## P.S.
Необходимо провести округление до сотых, 
это можно сделать, например, с помощью метода 
floor, который округляет аргумент до ближайшего 
меньшего. Если вы будете использовать другой 
способ, то необходимо чтобы разделителем дробной 
части была точка (.)

### Пример округления до десятых
```java
double sum = Math.floor(sum * 10) / 10;
```