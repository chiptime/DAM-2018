# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.9

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /usr/bin/cmake

# The command to remove a file.
RM = /usr/bin/cmake -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build"

# Include any dependencies generated for this target.
include CMakeFiles/client.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/client.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/client.dir/flags.make

CMakeFiles/client.dir/client.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/client.cpp.o: ../client.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/client.dir/client.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/client.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/client.cpp"

CMakeFiles/client.dir/client.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/client.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/client.cpp" > CMakeFiles/client.dir/client.cpp.i

CMakeFiles/client.dir/client.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/client.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/client.cpp" -o CMakeFiles/client.dir/client.cpp.s

CMakeFiles/client.dir/client.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/client.cpp.o.requires

CMakeFiles/client.dir/client.cpp.o.provides: CMakeFiles/client.dir/client.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/client.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/client.cpp.o.provides

CMakeFiles/client.dir/client.cpp.o.provides.build: CMakeFiles/client.dir/client.cpp.o


CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o: /home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno\ Silva\ -\ Examen/multi/libreria/ncurses/ncurses.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/ncurses/ncurses.cpp"

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/ncurses/ncurses.cpp" > CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.i

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/ncurses/ncurses.cpp" -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.s

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.requires

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.provides: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.provides

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.provides.build: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o


CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o: /home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno\ Silva\ -\ Examen/multi/libreria/mapa/mapa.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/mapa/mapa.cpp"

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/mapa/mapa.cpp" > CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.i

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/mapa/mapa.cpp" -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.s

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.requires

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.provides: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.provides

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.provides.build: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o


CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o: /home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno\ Silva\ -\ Examen/multi/libreria/tank/tank.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_4) "Building CXX object CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/tank/tank.cpp"

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/tank/tank.cpp" > CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.i

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/tank/tank.cpp" -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.s

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.requires

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.provides: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.provides

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.provides.build: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o


CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o: /home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno\ Silva\ -\ Examen/multi/libreria/global/global.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_5) "Building CXX object CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/global/global.cpp"

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/global/global.cpp" > CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.i

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/global/global.cpp" -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.s

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.requires

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.provides: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.provides

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.provides.build: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o


CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o: /home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno\ Silva\ -\ Examen/multi/libreria/bullet/bullet.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_6) "Building CXX object CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/bullet/bullet.cpp"

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/bullet/bullet.cpp" > CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.i

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/bullet/bullet.cpp" -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.s

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.requires

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.provides: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.provides

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.provides.build: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o


CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o: CMakeFiles/client.dir/flags.make
CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o: /home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno\ Silva\ -\ Examen/multi/libreria/teclas/teclas.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_7) "Building CXX object CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/teclas/teclas.cpp"

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/teclas/teclas.cpp" > CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.i

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/libreria/teclas/teclas.cpp" -o CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.s

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.requires:

.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.requires

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.provides: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.requires
	$(MAKE) -f CMakeFiles/client.dir/build.make CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.provides.build
.PHONY : CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.provides

CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.provides.build: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o


# Object files for target client
client_OBJECTS = \
"CMakeFiles/client.dir/client.cpp.o" \
"CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o" \
"CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o" \
"CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o" \
"CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o" \
"CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o" \
"CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o"

# External object files for target client
client_EXTERNAL_OBJECTS =

client: CMakeFiles/client.dir/client.cpp.o
client: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o
client: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o
client: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o
client: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o
client: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o
client: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o
client: CMakeFiles/client.dir/build.make
client: CMakeFiles/client.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_8) "Linking CXX executable client"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/client.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/client.dir/build: client

.PHONY : CMakeFiles/client.dir/build

CMakeFiles/client.dir/requires: CMakeFiles/client.dir/client.cpp.o.requires
CMakeFiles/client.dir/requires: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/ncurses/ncurses.cpp.o.requires
CMakeFiles/client.dir/requires: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/mapa/mapa.cpp.o.requires
CMakeFiles/client.dir/requires: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/tank/tank.cpp.o.requires
CMakeFiles/client.dir/requires: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/global/global.cpp.o.requires
CMakeFiles/client.dir/requires: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/bullet/bullet.cpp.o.requires
CMakeFiles/client.dir/requires: CMakeFiles/client.dir/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno_Silva_-_Examen/multi/libreria/teclas/teclas.cpp.o.requires

.PHONY : CMakeFiles/client.dir/requires

CMakeFiles/client.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/client.dir/cmake_clean.cmake
.PHONY : CMakeFiles/client.dir/clean

CMakeFiles/client.dir/depend:
	cd "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/multi/cliente/build/CMakeFiles/client.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/client.dir/depend

