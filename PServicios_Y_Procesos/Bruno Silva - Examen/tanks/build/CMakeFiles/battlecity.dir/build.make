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
CMAKE_SOURCE_DIR = "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build"

# Include any dependencies generated for this target.
include CMakeFiles/battlecity.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/battlecity.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/battlecity.dir/flags.make

CMakeFiles/battlecity.dir/battlecity.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/battlecity.cpp.o: ../battlecity.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building CXX object CMakeFiles/battlecity.dir/battlecity.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/battlecity.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/battlecity.cpp"

CMakeFiles/battlecity.dir/battlecity.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/battlecity.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/battlecity.cpp" > CMakeFiles/battlecity.dir/battlecity.cpp.i

CMakeFiles/battlecity.dir/battlecity.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/battlecity.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/battlecity.cpp" -o CMakeFiles/battlecity.dir/battlecity.cpp.s

CMakeFiles/battlecity.dir/battlecity.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/battlecity.cpp.o.requires

CMakeFiles/battlecity.dir/battlecity.cpp.o.provides: CMakeFiles/battlecity.dir/battlecity.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/battlecity.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/battlecity.cpp.o.provides

CMakeFiles/battlecity.dir/battlecity.cpp.o.provides.build: CMakeFiles/battlecity.dir/battlecity.cpp.o


CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o: ../ncurses/ncurses.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Building CXX object CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/ncurses/ncurses.cpp"

CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/ncurses/ncurses.cpp" > CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.i

CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/ncurses/ncurses.cpp" -o CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.s

CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.requires

CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.provides: CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.provides

CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.provides.build: CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o


CMakeFiles/battlecity.dir/mapa/mapa.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/mapa/mapa.cpp.o: ../mapa/mapa.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_3) "Building CXX object CMakeFiles/battlecity.dir/mapa/mapa.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/mapa/mapa.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/mapa/mapa.cpp"

CMakeFiles/battlecity.dir/mapa/mapa.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/mapa/mapa.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/mapa/mapa.cpp" > CMakeFiles/battlecity.dir/mapa/mapa.cpp.i

CMakeFiles/battlecity.dir/mapa/mapa.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/mapa/mapa.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/mapa/mapa.cpp" -o CMakeFiles/battlecity.dir/mapa/mapa.cpp.s

CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.requires

CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.provides: CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.provides

CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.provides.build: CMakeFiles/battlecity.dir/mapa/mapa.cpp.o


CMakeFiles/battlecity.dir/tank/tank.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/tank/tank.cpp.o: ../tank/tank.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_4) "Building CXX object CMakeFiles/battlecity.dir/tank/tank.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/tank/tank.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/tank/tank.cpp"

CMakeFiles/battlecity.dir/tank/tank.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/tank/tank.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/tank/tank.cpp" > CMakeFiles/battlecity.dir/tank/tank.cpp.i

CMakeFiles/battlecity.dir/tank/tank.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/tank/tank.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/tank/tank.cpp" -o CMakeFiles/battlecity.dir/tank/tank.cpp.s

CMakeFiles/battlecity.dir/tank/tank.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/tank/tank.cpp.o.requires

CMakeFiles/battlecity.dir/tank/tank.cpp.o.provides: CMakeFiles/battlecity.dir/tank/tank.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/tank/tank.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/tank/tank.cpp.o.provides

CMakeFiles/battlecity.dir/tank/tank.cpp.o.provides.build: CMakeFiles/battlecity.dir/tank/tank.cpp.o


CMakeFiles/battlecity.dir/global/global.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/global/global.cpp.o: ../global/global.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_5) "Building CXX object CMakeFiles/battlecity.dir/global/global.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/global/global.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/global/global.cpp"

CMakeFiles/battlecity.dir/global/global.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/global/global.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/global/global.cpp" > CMakeFiles/battlecity.dir/global/global.cpp.i

CMakeFiles/battlecity.dir/global/global.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/global/global.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/global/global.cpp" -o CMakeFiles/battlecity.dir/global/global.cpp.s

CMakeFiles/battlecity.dir/global/global.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/global/global.cpp.o.requires

CMakeFiles/battlecity.dir/global/global.cpp.o.provides: CMakeFiles/battlecity.dir/global/global.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/global/global.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/global/global.cpp.o.provides

CMakeFiles/battlecity.dir/global/global.cpp.o.provides.build: CMakeFiles/battlecity.dir/global/global.cpp.o


CMakeFiles/battlecity.dir/bullet/bullet.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/bullet/bullet.cpp.o: ../bullet/bullet.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_6) "Building CXX object CMakeFiles/battlecity.dir/bullet/bullet.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/bullet/bullet.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/bullet/bullet.cpp"

CMakeFiles/battlecity.dir/bullet/bullet.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/bullet/bullet.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/bullet/bullet.cpp" > CMakeFiles/battlecity.dir/bullet/bullet.cpp.i

CMakeFiles/battlecity.dir/bullet/bullet.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/bullet/bullet.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/bullet/bullet.cpp" -o CMakeFiles/battlecity.dir/bullet/bullet.cpp.s

CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.requires

CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.provides: CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.provides

CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.provides.build: CMakeFiles/battlecity.dir/bullet/bullet.cpp.o


CMakeFiles/battlecity.dir/teclas/teclas.cpp.o: CMakeFiles/battlecity.dir/flags.make
CMakeFiles/battlecity.dir/teclas/teclas.cpp.o: ../teclas/teclas.cpp
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_7) "Building CXX object CMakeFiles/battlecity.dir/teclas/teclas.cpp.o"
	/usr/bin/c++  $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -o CMakeFiles/battlecity.dir/teclas/teclas.cpp.o -c "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/teclas/teclas.cpp"

CMakeFiles/battlecity.dir/teclas/teclas.cpp.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing CXX source to CMakeFiles/battlecity.dir/teclas/teclas.cpp.i"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -E "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/teclas/teclas.cpp" > CMakeFiles/battlecity.dir/teclas/teclas.cpp.i

CMakeFiles/battlecity.dir/teclas/teclas.cpp.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling CXX source to assembly CMakeFiles/battlecity.dir/teclas/teclas.cpp.s"
	/usr/bin/c++ $(CXX_DEFINES) $(CXX_INCLUDES) $(CXX_FLAGS) -S "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/teclas/teclas.cpp" -o CMakeFiles/battlecity.dir/teclas/teclas.cpp.s

CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.requires:

.PHONY : CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.requires

CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.provides: CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.requires
	$(MAKE) -f CMakeFiles/battlecity.dir/build.make CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.provides.build
.PHONY : CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.provides

CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.provides.build: CMakeFiles/battlecity.dir/teclas/teclas.cpp.o


# Object files for target battlecity
battlecity_OBJECTS = \
"CMakeFiles/battlecity.dir/battlecity.cpp.o" \
"CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o" \
"CMakeFiles/battlecity.dir/mapa/mapa.cpp.o" \
"CMakeFiles/battlecity.dir/tank/tank.cpp.o" \
"CMakeFiles/battlecity.dir/global/global.cpp.o" \
"CMakeFiles/battlecity.dir/bullet/bullet.cpp.o" \
"CMakeFiles/battlecity.dir/teclas/teclas.cpp.o"

# External object files for target battlecity
battlecity_EXTERNAL_OBJECTS =

battlecity: CMakeFiles/battlecity.dir/battlecity.cpp.o
battlecity: CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o
battlecity: CMakeFiles/battlecity.dir/mapa/mapa.cpp.o
battlecity: CMakeFiles/battlecity.dir/tank/tank.cpp.o
battlecity: CMakeFiles/battlecity.dir/global/global.cpp.o
battlecity: CMakeFiles/battlecity.dir/bullet/bullet.cpp.o
battlecity: CMakeFiles/battlecity.dir/teclas/teclas.cpp.o
battlecity: CMakeFiles/battlecity.dir/build.make
battlecity: CMakeFiles/battlecity.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_8) "Linking CXX executable battlecity"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/battlecity.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/battlecity.dir/build: battlecity

.PHONY : CMakeFiles/battlecity.dir/build

CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/battlecity.cpp.o.requires
CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/ncurses/ncurses.cpp.o.requires
CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/mapa/mapa.cpp.o.requires
CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/tank/tank.cpp.o.requires
CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/global/global.cpp.o.requires
CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/bullet/bullet.cpp.o.requires
CMakeFiles/battlecity.dir/requires: CMakeFiles/battlecity.dir/teclas/teclas.cpp.o.requires

.PHONY : CMakeFiles/battlecity.dir/requires

CMakeFiles/battlecity.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/battlecity.dir/cmake_clean.cmake
.PHONY : CMakeFiles/battlecity.dir/clean

CMakeFiles/battlecity.dir/depend:
	cd "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build" "/home/bruno/Documentos/DAM-2018/PServicios_Y_Procesos/Bruno Silva - Examen/tanks/build/CMakeFiles/battlecity.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/battlecity.dir/depend
