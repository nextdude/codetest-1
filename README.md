# Code Test
## Running the test
### Windows

- Clone this repository: `git clone https://github.com/nextdude/codetest-1`
- Or click [![](http://i.imgur.com/Su6om9f.png)](archive/master.zip), and unzip to a directory.
- Using Windows Explorer, browse to `codetest-1\test`, and double click on `test.cmd`

![](http://i.imgur.com/LFlkioh.png)
- Open and edit the code.* files in the main directory. Use any code editor you are comfortable with.

![](http://i.imgur.com/4CBdwDz.png)
- Test will re-execute on any code change.

![](http://i.imgur.com/fvPU3IQ.png)
- Press Ctrl-C to exit test monitor.

### Mac/Linux
- Run Terminal ![](http://i.imgur.com/SXN3tNM.png)
- Dependencies:
  - Mac dependencies: (java jdk, git, scala, nodejs, npm, mono)
    - Java: http://download.oracle.com/otn-pub/java/jdk/8u45-b14/jdk-8u45-macosx-x64.dmg
    - Homebrew: Install homebrew (http://brew.sh/) then install git, scala, nodejs and npm
    - Mono: http://download.mono-project.com/archive/4.0.0/macos-10-x86/MonoFramework-MDK-4.0.0.macos10.xamarin.x86.pkg
  - Ubuntu: `sudo apt-get install git scala mono-devel fsharp nodejs npm openjdk-7-jdk`
  - You can also install an ubuntu virtual machine on your windows or mac machine with [VirtualBox](https://www.virtualbox.org/wiki/Downloads) and then follow the ubuntu instructions
- Clone this repository: `git clone https://github.com/nextdude/codetest-1`
- Run the test script
  - `cd codetest-1/test`
  - `sh test.sh`
- Run cd to test and sh test.sh from a terminal
- Open and edit the code.* files in the main directory. Use any code editor you are comfortable with.
- Test will re-execute on any code change.
- Press Ctrl-C to exit test monitor.
