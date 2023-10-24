mkdir countries 2>/dev/null;
cd countries
mkdir USA India UK 2>/dev/null
echo "Washington1, D.C" 1>/dev/null
echo "London" > UK/capital.txt
echo "New Delhi" > India/capital.txt
uptime

#/dev/null is the null device it takes any input you want and throws it away. 
#It can be used to suppress any output.
