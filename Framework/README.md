# PlaySEM SER Introduction

**PlaySEM Sensory Effects Renderer (SER) 2.0.0** became a framework for delivering sensory effects, such as wind, smell, vibration, and light to heterogeneous systems. It deals with variability in Mulsemedia Systems following a set of architectural and design patterns to accommodate different profiles of communication, connectivity, and sensory eﬀects metadata standard according to the need of multimedia applications and devices available in the user’s environment. It provides a bus of services (UPnP, CoAP, MQTT, and WebSocket currently, however, extensible) for timeline (e.g. video players) or event-based applications (e.g. games, VR applications) to integrate with it, and offers a set of connectivity protocols, such as Serial/USB/FTDI, Wi-Fi, Ethernet, and Bluetooth to connect with devices. 

If you do not intend to use real devices, just set it up to use mock devices. If you do not use the MPEG-V standard, just create your own parser and change the strategy in the config file. You can adapt it to your taste and expand the framework to support new technologies by extending existing classes of communication and connectivity protocols, devices, and sensory effects metadata standards. See the configuration section and related papers for more details. 

# Prerequisites
* Java 1.8 or greater (http://www.java.com/en/download)<br/>
* If you are going to use serial communication:
  * RXTX library (http://rxtx.qbang.org/wiki/index.php/Installation or http://www.agaveblue.org/howtos/Comm_How-To.shtml). Not required if you set up mock devices.

# Running:
* [Download](https://github.com/estevaosaleme/PlaySEM_SERenderer/releases) the latest release
* Uncompress the file **PlaySEM_SER_< version >.zip**
* Configure the file **SERenderer.xml** properly (pay attention to it to avoid mistakes when starting the framework)
* Run the command `java -jar PlaySEM_SERenderer.jar -Dcom.sun.xml.internal.bind.v2.runtime.JAXBContextImpl.fastBoot=true` (Please, check if you need to update the name of the jar file)

# Configuration (SERenderer.xml):<br />
Please refer to the article *[A Mulsemedia Framework for Delivering Sensory Effects to Heterogeneous Systems](https://doi.org/10.1007/s00530-019-00618-8)* to configure the framework before using it. 

***
Please, report any application crash (or bug) via [issue tracker](https://github.com/estevaosaleme/PlaySEM_SERenderer/issues).<br /><br />
Need a compatible Video Player for sensory effects? Visit the **PlaySEM SE VP** repository at https://github.com/estevaosaleme/PlaySEM_SEVideoPlayer<br />
Need an older version of PlaySEM SER? Visit **releases** at https://github.com/estevaosaleme/PlaySEM_SERenderer/releases<br />


# Related papers: 
* SALEME, E. B.; SANTOS, C. A. S.; GHINEA, G., [A Mulsemedia Framework for Delivering Sensory Effects to Heterogeneous Systems](https://doi.org/10.1007/s00530-019-00618-8), *Multimedia Systems*, Springer, 2019.
* SALEME, E. B.; COVACI, A.; MESFIN, G.; SANTOS, C. A. S.; GHINEA, G., [Mulsemedia DIY: A Survey of Devices and a Tutorial for Building your own Mulsemedia Environment](https://doi.org/10.1145/3319853), *ACM Computing Surveys*, 2019.
* SALEME, E. B.; SANTOS, C. A. S.; GHINEA, G., [Coping with the Challenges of Delivering Multiple Sensorial Media](https://doi.org/10.1109/MMUL.2018.2873565), *IEEE MultiMedia*, 2019.
* SALEME, E. B.; SANTOS, C. A. S.; GHINEA, G., [Improving Response Time Interval in Networked Event-Based Mulsemedia Systems](https://doi.org/10.1145/3204949.3204965), *ACM MMSys'18*.
* SALEME, E. B.; CELESTRINI, J. R.; SANTOS, C. A. S., [Time Evaluation for the Integration of a Gestural Interactive Application with a Distributed Mulsemedia Platform](https://doi.org/10.1145/3083187.3084013), *ACM MMSys'17*.
* SALEME, E. B.; SANTOS, C. A. S., [PlaySEM: a Platform for Rendering MulSeMedia Compatible with MPEG-V](http://dx.doi.org/10.1145/2820426.2820450), *WebMedia'15*.
