======================================================================  
Project site:  
https://netthingsos.org

The status:
under development (no stable version avalable)

=======================================================================  
Short description:  
NetThingsOS is an opensource Linux based operation system for managing IoT systems and networks on-premises side.   


The system provides folowing main features:  
1. MQTT server/broker  
2. IoT gateway services based on ThingsBoard IoT gateway  
3. Relibale conenction to the cloud based platforms with uplink channel reservation  
4. Connection to the several IoT platforms  
5. Local data storage  
6. Custom data processing  
7. Network security features to protect the IoT system amnd data  
8. Running on different ARM and AMD based platforms  
9. Time and location services  
10. System helth monitoring and hardware reservation  

The system is specially designed for installation on embedded hardware, small servers or network platforms.  
It is managed both from Linux CLI or from WEB interface (WEB in not impleneted at the moment)  




========================================================================  
Build guide  
NetThingsOS uses OpenEmbedded build systems.   

Dependencies:   
TBD  

To build the NetThingsOS for qemu emulator, make a following commands (for ubuntu 20.4)  
source ./oe-init-build-env build-qemu   
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
IoT gateway  




========================================================================  
Roadmap:  
LoRaWAN server  
Intergartion layer  
NTP  
Claud based IoT platform integration  
Helth monitoring  
Local data storage  
WEB interface  
Hardware integration  




