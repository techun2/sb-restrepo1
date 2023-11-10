package com.myj.conc.sema.ex1;

import java.util.concurrent.Semaphore;

class MySemaPhoThread extends Thread

{

	Semaphore sem;

	String threadName;

	public MySemaPhoThread(Semaphore sem, String threadName)

	{

		super(threadName);

		this.sem = sem;

		this.threadName = threadName;

	}

	@Override

	public void run() {

		// Run By X

		if (this.getName().equals("X"))

		{

			System.out.println("Starting " + threadName);

			try

			{

				// Will get the permit to access shared resource

				System.out.println(threadName + " awaiting permit.");

				// acquiring the lock

				sem.acquire();

				System.out.println(threadName + " received a permit.");

				// Now, accessing the shared resource and rest will wait

				for (int i = 0; i < 7; i++)

				{

					Resource.count++;

					System.out.println(threadName + ": " + Resource.count);

					// Now thread Y will try to execute

					Thread.sleep(20);

				}

			} catch (InterruptedException exc) {

				System.out.println(exc);

			}

			// Release the permit.

			System.out.println(threadName + " released permit.");

			sem.release();

		}

		// run by thread Y

		else

		{

			System.out.println("Starting " + threadName);

			try

			{

				// First, Y will try to get permit

				System.out.println(threadName + " awaiting permit.");

				// acquiring the lock

				sem.acquire();

				System.out.println(threadName + " received a permit.");

				// Now, accessing the shared resource and others will wait

				for (int i = 0; i < 7; i++)

				{

					Resource.count--;

					System.out.println(threadName + ": " + Resource.count);

					// Now, allowing a context switch -- if possible.

					// for thread X to execute

					Thread.sleep(20);

				}

			} catch (InterruptedException exc) {

				System.out.println(exc);

			}

			// Release the permit.

			System.out.println(threadName + " released permit.");

			sem.release();

		}

	}

}