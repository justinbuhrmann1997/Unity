using UnityEngine;

public class PlayerMovement : MonoBehaviour {

    public float forwardSpeed = 600f;
    public float turnSpeed = 600f;
    public Rigidbody player1;
	
	// Update is called once per frame
	void FixedUpdate () {
        //forward movement
        player1.AddForce(0, 0, forwardSpeed * Time.deltaTime);

        if (Input.GetKey("d"))
        {
            player1.AddForce(turnSpeed * Time.deltaTime, 0, 0);
        }

        if (Input.GetKey("a"))
        {
            player1.AddForce(-turnSpeed * Time.deltaTime, 0, 0);
        }
	}
}
