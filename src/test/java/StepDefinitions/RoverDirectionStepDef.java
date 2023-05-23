package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.Rover;

public class RoverDirectionStepDef extends Rover {
	Rover rover=new Rover();
	
	@Given("that we deployed a robot at position X,Y \\({double})")
	public void that_we_deployed_a_robot_at_position_X_Y(Double facing) {
		rover.setPosition(0,0,1);
	}

	@Given("change in state of the rover in terms of direction will not affect the positioning of the rover in terms of X,Y location")
	public void change_in_state_of_the_rover_in_terms_of_direction_will_not_affect_the_positioning_of_the_rover_in_terms_of_X_Y_location() {
	    // changing the position
		rover.setPosition(0,0,2);
	}
	
	@When("we pass a command string {string} for a rover positioned at X,Y\\({double}) facing North")
	public void we_pass_a_command_string_for_a_rover_positioned_at_X_Y_facing_North(String ct, Double double1) {
	    // passing the character
		// position declared as N
		rover.process("M");
		rover.setPosition(0,0,1);
	}
	@Then("final destination of the Rover will be X,Y\\({double})")
	public void final_destination_of_the_Rover_will_be_X_Y(Double double1) {
		//changing the position to East
		rover.setPosition(0,0,2);
	}

	@Then("state change in direction with command {string} or {string} will only cause the rover to face a new direction")
	public void state_change_in_direction_with_command_or_will_only_cause_the_rover_to_face_a_new_direction(String direction1, String direction2) {
	    // Write code here that turns the phrase above into concrete actions
		rover.process(direction1);
		rover.process(direction2);
	}

	@Then("position according to X and Y will remain same")
	public void position_according_to_X_and_Y_will_remain_same() {
		rover.setPosition(5, 5,2);
		System.out.println("The Given Position is");
		 rover.printPosition();
	}


@When("move from point \\(X,Y) and the rover facing towards North facing as {int}")
public void move_from_point_X_Y_and_the_rover_facing_towards_North_facing_as(Integer int1) {
	rover.printPosition();
}


	@Then("increment	++Y")
	public void increment_Y() {
	 rover.move();
	}
	@When("move from point \\(X,Y) and the rover facing towards South facing as {int}")
	public void move_from_point_X_Y_and_the_rover_facing_towards_South_facing_as(Integer int1) {
		rover.printPosition();
	}

	@Then("will decrement   --Y")
	public void will_decrement_Y() {
		 rover.move();
	}
	
	@When("move from point \\(X,Y) and the rover facing towards East facing as {int}")
	public void move_from_point_X_Y_and_the_rover_facing_towards_East_facing_as(Integer int1) {
		rover.printPosition();
	}


	@Then("will increment     ++X")
	public void will_increment_X() {
		 rover.move();
	}
	@When("move from point \\(X,Y) and the rover facing towards West facing as {int}")
	public void move_from_point_X_Y_and_the_rover_facing_towards_West_facing_as(Integer int1) {
		rover.printPosition();
	}

	@Then("will decrement   --X")
	public void will_decrement_X() {
		 rover.move();
	}

	@Given("rover is moving as per the X,Y Co-ordinate values")
	public void rover_is_moving_as_per_the_X_Y_Co_ordinate_values() {
		rover.setPosition(5, 5,1);
	}

	@When("the rover is moving as per the position {int} {int} direction {int} {int} N with command LMLMLMLMM   change in state of the rover in terms of direction will not affect the positioning of the rover in terms of X,Y location")
	public void the_rover_is_moving_as_per_the_position_direction_N_with_command_LMLMLMLMM_change_in_state_of_the_rover_in_terms_of_direction_will_not_affect_the_positioning_of_the_rover_in_terms_of_X_Y_location(Integer int1, Integer int2, Integer int3, Integer int4) {
		rover.setPosition(1,2,N);
		rover.process("LMLMLMLMM");
	}

	@Then("the output should be {int} {int} N")
	public void the_output_should_be_N(Integer int1, Integer int2) {
		String actualValueis= rover.printPositionReturn();
		 Assert.assertEquals(actualValueis,"1 3 N");
		
		
	}




}
