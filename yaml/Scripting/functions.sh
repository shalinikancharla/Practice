#!/bin/bash
function prepare-directory-structure(){
  mkdir apps
  cd apps
  mkdir app1 app2 app3
  touch app1/logs app2/logs app3/logs
}

function add(){
 sum=$(( $1 + $2 ))
 echo "The result is $sum"

}
result=$(add 4 5)
 echo  $result

function read_numbers(){
  read -p "Enter Number1: " number1
  read -p "Enter Number2: " number2
}

while true
do
  echo "1. Add"
  echo "2. Subtract"
  echo "3. Multiply"
  echo "4. Divide"
  echo "5. Quit"

  read -p "Enter your choice: " choice

  case $choice in
    1)  read_numbers
        echo $(( $number1 + $number2 )) ;;
    2)
        read_numbers
        echo $(( $number1 - $number2 )) ;;

    3)
        read_numbers
        echo $(( $number1 * $number2 )) ;;

    4)
        read_numbers
        echo $(( $number1 / $number2 )) ;;

    5)  break
  esac

done