# @toruslabs/react-native-tss-lib-bridge

Tss lib for react-native
** only for react-native **

## Installation

```sh
npm install --save @toruslabs/react-native-tss-lib-bridge
```

## Usage
1. Install required peer dependency
   https://github.com/torusresearch/react-native-tss-lib/blob/4cf28633cb5c066c7237821441e4d6497e3041d4/package.json#L87
   
2. configure metro.config
    https://github.com/inokawa/react-native-react-bridge#1-fix-metroconfigjs-to-use-babeltransformer-from-this-library

3. 

```js
import { Bridge } from "@toruslabs/react-native-tss-lib-bridge";
import * as TssLibRN from "@toruslabs/react-native-tss-lib-bridge";
import {
  Web3AuthMPCCoreKit,
} from '@web3auth/mpc-core-kit';

class ReactStorage implements IAsyncStorage {
  async getItem(key: string): Promise<string | null> {
    return EncryptedStorage.getItem(key);
  }

  async setItem(key: string, value: string): Promise<void> {
    return EncryptedStorage.setItem(key, value);
  }
}
const coreKitInstancelocal = new Web3AuthMPCCoreKit({
    web3AuthClientId: 'torus-key-test',
    web3AuthNetwork: WEB3AUTH_NETWORK.DEVNET,
    uxMode: 'react-native',
    asyncStorageKey: new ReactStorage(),
    tssLib: TssLibRN,
});

// ...

<View>
<Bridge  />
...
<View>
```


## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT

---

Made with [create-react-native-library](https://github.com/callstack/react-native-builder-bob)
