# for num in {31..40}
# do      
#   echo ${num}
# done

#get the information from another file
directory="."
pattern="*NumberNames*"
for file in $(ls)
do 
  if [[ "$file" == $pattern ]]
  then 
    for i in $(cat "$file")
      do
        echo $i
      done  
  fi 
done  

#while loop

# to_number=10
# number=0
# while [ $number -lt $to_number ]
# do
#   echo $(( number++ ))
# done

# #read numbers from input do addition,sunraction,multiply and division based upon our choice

# while true
# do
#   echo "1. Add"
#   echo "2. Subtract"
#   echo "3. Multiply"
#   echo "4. Divide"
#   echo "5. Quit"

#   read -p "Enter your choice: " choice

#   if [ $choice -eq 1 ]
#   then
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 + $number2 ))
#   elif [ $choice -eq 2 ]
#   then
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 - $number2 ))
#   elif [ $choice -eq 3 ]
#   then
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 * $number2 ))
#   elif [ $choice -eq 4 ]
#   then
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 / $number2 ))
#   elif [ $choice -eq 5 ]
#   then
#     break
#   fi

# done


# #case statement
# os=Fedora

# case $os in
#   "Fedora") echo "Uses RPM package manager" ;;

#   "RHEL") echo "Uses RPM package manager" ;;

#   "CentOS") echo "Uses RPM package manager" ;;

#   "Debian") echo "Uses DEB package manager" ;;

#   "Ubuntu")
#             echo "Uses DEB package manager" ;;
# esac

# #case 2 
# while true
# do
#   echo "1. Add"
#   echo "2. Subtract"
#   echo "3. Multiply"
#   echo "4. Divide"
#   echo "5. average of two numbers"
#   echo "6. Quit"

#   read -p "Enter your choice: " choice

#   case $choice in
#    1)
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 + $number2 ));;
#    2)
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 - $number2 ));;
#   3)
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 * $number2 ));;
#   4)
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Answer=$(( $number1 / $number2 ));;
#    5)
#         read -p "Enter Number1: " number1
#         read -p "Enter Number2: " number2
#         echo Average=$((( $number1 + $number2 ) / 2));;
#    6)
             
#     break;;
#   esac

# done

