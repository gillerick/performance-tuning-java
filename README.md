### Code Optimization Techniques

#### Threading

- Multithreading allows an application to do multiple things at the same time. Multithreading can however be difficult
  to implement. While it improves performance in many cases, it has drawbacks if the default mechanisms for cooperation
  between threads are used simplistically.
- Synchronizing methods _liberally_ may seem like a good safe programming, but it is a sure recipe for reducing
  performance at best, and creating deadlocks at worst.