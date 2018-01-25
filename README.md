# NumberOfSwitches
N light bulbs are connected by a wire. Each bulb has a switch associated with it, however due to faulty wiring, a switch also changes the state of all the bulbs to the right of current bulb. Given an initial state of all bulbs, find the minimum number of switches you have to press to turn on all the bulbs.

The main idea in the solution is: I iterate over the list until reaching to an off switch. That’s obviously the first “press”. Then if the next bulb in the original list is on it will be off after turning the one before on. So, now we should check for the “on” status to reach to the next “press”. So, after each “press” I need to check for the opposite state for next bulb.
