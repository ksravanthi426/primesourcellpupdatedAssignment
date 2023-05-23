Feature: Test MARS Rovers

@TaskA @Regression
  Scenario: Rover direction facing and positioning initialisation
    Given that we deployed a robot at position X,Y (0,0)
    And   change in state of the rover in terms of direction will not affect the positioning of the rover in terms of X,Y location 
    When we pass a command string "MM" for a rover positioned at X,Y(0,0) facing North
    Then final destination of the Rover will be X,Y(0,2)
    And state change in direction with command "L" or "R" will only cause the rover to face a new direction
    And position according to X and Y will remain same

    @TaskB @Regression
  Scenario: Rover position and location
    Given change in state of the rover in terms of direction will not affect the positioning of the rover in terms of X,Y location 
    When move from point (X,Y) and the rover facing towards North facing as 1 
    Then increment	++Y 
    When  move from point (X,Y) and the rover facing towards South facing as 2
    Then will decrement   --Y
    When move from point (X,Y) and the rover facing towards East facing as 3
    Then will increment     ++X
    When move from point (X,Y) and the rover facing towards West facing as 4
    Then will decrement   --X
    
    @TaskC @Regression
    Scenario Outline: move the rover as per the scenario problem
        Given rover is moving as per the X,Y Co-ordinate values
  			When the rover is moving as per the position <positionvalue> direction <directionvalue> with command <commandvalue>   change in state of the rover in terms of direction will not affect the positioning of the rover in terms of X,Y location 
  			Then the output should be <outputValue>
  			  Examples: 
			      | positionvalue | directionvalue |commandvalue|outputValue|
			      | 5 5   				|    1 2 N 			 |LMLMLMLMM   |1 3 N|