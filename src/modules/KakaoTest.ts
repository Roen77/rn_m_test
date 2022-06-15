import {NativeModules} from 'react-native';
const {KakaoTest} = NativeModules;

interface KakaoTestInterface {
  wirteTestKakao(name: string): Promise<boolean>;
}

export default KakaoTest as KakaoTestInterface;
