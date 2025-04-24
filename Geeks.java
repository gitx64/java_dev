+-------------+
|   Person    |         <-- Base class
+-------------+
       |
---------------------
|                   |
+-----------+     +-------------+
|  Student  |     |   Teacher   |     <-- Hierarchical Inheritance
+-----------+     +-------------+
|
|
v
+-----------------------+           +-----------+   +--------+
| MultiTalentedStudent  | <-------- |   Sport   |   |  Art   |
+-----------------------+           +-----------+   +--------+
| Inherits: Student                ^               ^
| Implements: Sport, Art           \_____________/
+-----------------------------------------------+
  <-- Multiple Inheritance using Interfaces
