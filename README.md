# NetThingsOS
An opensource Linux based operation system for managing IoT systems and networks on-premises side.   


======================================================================  
Project site:  
http://netthingsos.org

=======================================================================  
short description:  
The system is specially designed for installation on embedded hardware, small servers or network platforms.  

It is managed both from Linux CLI or from WEB interface (WEB in not impleneted at the moment)  




========================================================================  
Build guide  
NetThingsOS uses OpenEmbedded build systems.   

Dependencies:   
TBD  

To build the NetThingsOS for qemu emulator, make a following commands (for ubuntu 20.4)  
source ./oe-init-build-env build_qemu   
bitbake netthingsos-0-1  


The quide how to build NetThingsOS for other platforms will be added later. 


======================================================================  
Run builded image for qemu using this command:  
runqemu qemux86-64  



========================================================================    
Installation guide  
TBD  



=======================================================================
packages installed:  
Mosquitto  



========================================================================  
Roadmap:  
IoT gateway  
LoRaWAN server  
Intergartion layer  
NTP  
Claud based IoT platform integration  
Helth monitoring  
Local data storage  
WEB interface  
Hardware integration  




