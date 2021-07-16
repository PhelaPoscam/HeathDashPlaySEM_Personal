# Mulsemedia with Health Sensors Devices

Thesis

## Install

Make sure your amBX set is not connected to the system until mentioned.

3) If you've already been trying installing amBX on your current setup, make sure every piece of amBX-relatable software has been deleted/uninstalled, and that there is no Jungo Windrvr6 nor Philips AmBX device present in Device Manager (if so, delete/uninstall them and erase their drivers within Device Manager). You can find the Device Manager via 'Control Panel' -> view by 'Small Icons' -> 'Device Manager' OR right click on 'This PC' on your desktop -> 'Properties' -> 'Device Manager' on the left sidebar.

1. Download the necessary drivers. I only used 1.10 and 2.0.0, so I did NOT use 1.4.4!

2. Install the amBX drivers v1.10 and reboot your system.

3. Now, use 'the good old method' of adding windrvr6 as legacy hardware and updating the amBX driver in device manager:

4. Open the Device Manager('Control Panel' -> view by 'Small Icons' -> 'Device Manager' OR right click on 'This PC' on your desktop -> 'Properties' -> 'Device Manager' on the left sidebar) and click on your computer or a random device within the manager to activate it, then go to 'Actions' on the top bar and click 'Add Legacy Hardware'.

5. Click Next on the first screen

6. Select "Install the hardware that I manually select from a list (Advanced)"

7. Leave "Show All Devices" highlighted and click Next

8. Click on Have Disk and browse to C:\Program Files (x86)\ambx\hardware (for 64-bit systems) or C:\Program Files\ambx\hardware (for 32-bit systems), select windrv6 and click Open

9. WinDriver will appear in the list, highlight this and click Next

10. Click Next to confirm then Finish.

11. Connect and turn on your amBX device.

12. The device will not install correctly and will appear in your device manager with a yellow !

Right click on the newly found unknown device and select "Update Driver" Select "Let me pick from a list of device drivers on my computer"

Browse back to C:\Program Files (x86)\ambx\hardware (for 64-bit systems) or C:\Program Files\ambx\hardware (for 32-bit systems), select amBX_Device and click OK

Highlight the Philips amBX (TM) Device and click Next

Click Next to confirm then Finish.

Reboot your system.

Previously, amBX should've started working now, but for me, it did not. You're only one small step away though.

4. (This step is very different to all the previous manuals I have seen) Keep your amBX system connected while installing amBX drivers v2.0.0, and then reboot. Then, magically, amBX will suddenly work!

If wanted, you can now install additional programs like Aurora Synesthesia and/or AmbiBox that will help you get the best out of the amBX system anno 2020. I like to use the first one for music-based effects, and the second one for visual effects, but I don't think you can use both programs at the same time. Enjoy!

I have no idea why this method specifically worked for me in the end, I tried so many different orders of installing the software, the drivers in device management, plugging in and out, reinstalling windows to an older version, etc. Perhaps some steps will prove to be unnecessary, but now that I've got it working, I wouldn't dare to mess with it any further XD

