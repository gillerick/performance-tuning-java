### Code Optimization Techniques

#### Threading

- Multithreading allows an application to do multiple things at the same time. Multithreading can however be difficult
  to implement. While it improves performance in many cases, it has drawbacks if the default mechanisms for cooperation
  between threads are used simplistically.
- Synchronizing methods _liberally_ may seem like a good safe programming, but it is a sure recipe for reducing
  performance at best, and creating deadlocks at worst.

### Synchronization Overhead

- There are two separate costs of synchronization. First, there is the operational cost of managing the _monitors_. This
  overhead can be significant: acquiring and testing for locks on the monitor for every synchronized method and block
  can _impose_ a lot of overhead.
- Attempting to acquire a lock must itself be a synchronized activity within the VM; otherwise, two threads can
  simultaneously execute the _lock-acquisition code_.
- Attempts to lock on different objects in two threads must still be synchronized to ensure that the object identity
  check and granting of the lock are handled _
  atomically_. This means that even attempting to get a lock on any object by two or more threads at the same time can
  still cause a _performance degradation_, as the VM grants only one thread at a time access to the _lock-acquisition
  routine_.
- The second cost of synchronization is in what it actually does. Synchronization _serializes execution_ of a set of
  statements so that only one thread at a time executes that set. Whenever multiple threads simultaneously try to
  execute the same synchronized block, those threads are effectively run together as one thread. This completely negates the purpose of having multiple threads and is potentially
