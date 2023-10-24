a=10
b=90
if [ $a == $b ]
then 
    echo " a is equal to b"
fi

if [ $a != $b ]
then 
   echo "a is not equal not b"
fi


# if-else
a=20
b=20
  
if [ $a == $b ]
then
    #If they are equal then print this
    echo "a is equal to b"
else
    #else print this
    echo "a is not equal to b"
fi



# else if lader

# Input from user
echo "Enter the Character -"
read ch

# If condition to check character entered
# is upper case, lower case or digit
if [[ $ch == [A-Z] ]]
then
echo "Upper Case"
elif [[ $ch == [a-z] ]]
then 
echo "Lower Case"
elif [[ $ch == [0-9] ]]
then
echo "Digit"

fi

# If condition to check character 
# entered is consonant or vowel.
if [[ $ch == [AEIOUaeiou] ]]
then
echo "Vowel"
else
echo "Consonant"
fi

if [ $1 -gt $2 ]
then
    echo $1
else
    echo $2
fi