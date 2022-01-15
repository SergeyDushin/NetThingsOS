======================================================================   
Short description:  
NetThingsOS is an opensource Linux based operation system (Linux distribution) 
for managing IoT systems and networks on-premises side. 

NetThingsOS is a turn-key solution for building the reliable industrial or consumer 
IoT networks where the stable, real-time and secure data collection and 
end-devices management are required.

The system is specially designed for installation on embedded hardware, 
small servers or network platforms.  It is managed both from Linux CLI 
or from WEB interface (WEB in not impleneted at the moment).

======================================================================  
Project sites:  
https://sdlab-co.ru/netthingsos/ (main)  
https://netthingsos.org (under development)  
  
Contacts:  
Sergey Dushin  
nihsuds@gmail.com  
s.dushin@sdlab-co.ru  
  
(c) 2021 by SDlab https://sdlab-co.ru/  
  
======================================================================  

***********************STATUS***************************************  
   
Under development (no stable version available)  
  
  
************************END_OF_STATUS*******************************  
=======================================================================     

The system provides following main features (planning in first stable release):  
1. MQTT server/broker  
2. IoT gateway services based on ThingsBoard IoT gateway  
3. Relibale conenction to the cloud based platforms with uplink channel reservation  
4. Connection to the several IoT platforms  
5. Local data storage  
6. Custom data processing  
7. Network security features to protect the IoT system and data  
8. Running on different ARM and AMD based platforms  
9. Time and location services  
10. System helth monitoring and hardware reservation  
   
========================================================================      
Roadmap:  

please, see https://sdlab-co.ru/netthingsos/roadmap/  
  
  
========================================================================   
  
Build guide  
NetThingsOS uses OpenEmbedded build system.   

Dependencies:   
TBD  


Qemu:
To build the NetThingsOS for qemu emulator, make a following commands (for ubuntu 20.4)  
source ./oe-init-build-env build-qemu   
bitbake netthingsos-0-1  



The guide how to build NetThingsOS for other platforms will be added later.   


======================================================================  
Run the built image for qemu using this command:  
runqemu qemux86-64  



========================================================================    
Installation guide  
TBD  





