# Mulsemedia with Health Sensors Devices

Thesis

## Install

Make sure your amBX set is not connected to the system until mentioned.

Please Note before doing Step 2: I did not try my 'working method' out on Windows 10 build 2004, even though I tried for hours to get amBX to work on 2004, I sadly did not try this exact method that worked for me in the end so I cannot confirm nor deny whether the following steps result in a working amBX setup on 2004 or higher. If you're on Windows 10 version 2004 or higher, have not installed amBX previously and are able to try it out, let me know if it still worked out for you, since downgrading to a older version is quite a hassle.

I also cannot say yet whether updating Windows to 2004 or higher while having amBX correctly installed on 1909 or older will stop amBX from working any longer, as I did not try updating yet. I do believe my old setup with amBX from which I upgraded was in fact still working on build 2004, with amBX installed on an earlier build, but I cannot 100% confirm this yet. UPDATE: Updating to 2004 while having amBX correctly installed on an earlier version will still work!

If possible, I'd say first try if it works on your current Windows and skip step 2. If it's not working, proceed with step 2 (and please leave a comment stating the Windows 10 build nr on which it did not work).

2. Make sure you're on Windows 10 build 1909 or older, because WinDriver6 does not seem to be supported on 2004. You can download ISO files of older versions of Windows here, then I used Rufus to make a bootable USB stick from the ISO. As 1909 wasn't available in my language, I used version 1903 for my particular fix, so I cannot say for sure whether 1909 will work as well, even though I think it will.

3) If you've already been trying installing amBX on your current setup, make sure every piece of amBX-relatable software has been deleted/uninstalled, and that there is no Jungo Windrvr6 nor Philips AmBX device present in Device Manager (if so, delete/uninstall them and erase their drivers within Device Manager). You can find the Device Manager via 'Control Panel' -> view by 'Small Icons' -> 'Device Manager' OR right click on 'This PC' on your desktop -> 'Properties' -> 'Device Manager' on the left sidebar.

4. Download the necessary drivers. I only used 1.10 and 2.0.0, so I did NOT use 1.4.4!

5. Install the amBX drivers v1.10 and reboot your system.

6. Now, use 'the good old method' of adding windrvr6 as legacy hardware and updating the amBX driver in device manager:

Open the Device Manager('Control Panel' -> view by 'Small Icons' -> 'Device Manager' OR right click on 'This PC' on your desktop -> 'Properties' -> 'Device Manager' on the left sidebar) and click on your computer or a random device within the manager to activate it, then go to 'Actions' on the top bar and click 'Add Legacy Hardware'.

Click Next on the first screen

Select "Install the hardware that I manually select from a list (Advanced)"

Leave "Show All Devices" highlighted and click Next

Click on Have Disk and browse to C:\Program Files (x86)\ambx\hardware (for 64-bit systems) or C:\Program Files\ambx\hardware (for 32-bit systems), select windrv6 and click Open

WinDriver will appear in the list, highlight this and click Next

Click Next to confirm then Finish.

Connect and turn on your amBX device.

The device will not install correctly and will appear in your device manager with a yellow !

Right click on the newly found unknown device and select "Update Driver" Select "Let me pick from a list of device drivers on my computer"

Browse back to C:\Program Files (x86)\ambx\hardware (for 64-bit systems) or C:\Program Files\ambx\hardware (for 32-bit systems), select amBX_Device and click OK

Highlight the Philips amBX (TM) Device and click Next

Click Next to confirm then Finish.

Reboot your system.

Previously, amBX should've started working now, but for me, it did not. You're only one small step away though.


7. (This step is very different to all the previous manuals I have seen) Keep your amBX system connected while installing amBX drivers v2.0.0, and then reboot. Then, magically, amBX will suddenly work!

If wanted, you can now install additional programs like Aurora Synesthesia and/or AmbiBox that will help you get the best out of the amBX system anno 2020. I like to use the first one for music-based effects, and the second one for visual effects, but I don't think you can use both programs at the same time. Enjoy!

I have no idea why this method specifically worked for me in the end, I tried so many different orders of installing the software, the drivers in device management, plugging in and out, reinstalling windows to an older version, etc. Perhaps some steps will prove to be unnecessary, but now that I've got it working, I wouldn't dare to mess with it any further XD

Good luck, and if you followed the instructions as given and it does NOT work, also let me know! Especially I'd love to hear which Windows build version you tried it on.
2 comentários
100% de upvotes
Esta discussão está arquivada
